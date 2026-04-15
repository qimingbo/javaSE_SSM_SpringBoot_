# 注解

## `@import`

`@Enable*`底层依赖于`@import`注解导入一些类，使用`@import`导入的类也会被`Spring`加载到`IoC`容器中。而`@import`提供四种用法

1. 导入bean
2. 导入配置类
3. 导入`ImportSelector`实现类，一般用于加载配置文件中的类。
4. 导入`ImportBeanDefinitionRegistrar`实现类

# `Mybatis`中`Mapper`接口和`XML`的绑定

`Mybatis`的约定：扫描该包下的 `Mapper` 接口，并尝试绑定对应 `XML`， `XML` 和接口在同一个包，文件名必须一致。

`Mybatis`需要做两件事

1. **加载 Mapper XML（注册 SQL）**
2. **扫描 Mapper 接口（生成代理对象）**

**当“XML路径是显式配置的（mapper-locations 或 `<mapper resource>`）且接口通过扫描注册时，XML文件名可以与接口名不一致；真正要求一致的是 `namespace` 与接口全类名。**

**`MyBatis`需要先加载 `Mapper XML`，将 `SQL` 注册到 `Configuration` 中，然后通过扫描 `Mapper` 接口生成代理对象。调用接口方法时，根据“接口全类名 + 方法名”找到对应 `SQL` 并执行**







# 对比 `SpringBoot 2.4.0` 版本前后配置文件机制改动

## 2.4.0版本之前

优先级由高到低:

* `Command line arguments`(命令行参数)

+ `Java System properties`(JVM参数)

+ `OS environment variables`(环境变量)

+ `Profile-specific application properties outside of your packaged jar `

+ `Profile-specific application properties packaged inside your jar `
+ `Application properties outside of your packaged jar`
+ `Application properties packaged inside your jar   `

## 配置文件

我们可以通过指定 `spring.config.name` 属性来修改默认的配置文件名，默认即为 `application`

同时，我们可以指定 `spring.config.location` 属性来指定配置文件（路径），倘若该配置项以 `/` 结尾，则对应的 `spring.config.name` 会被拼接上去，组成完整的配置文件路径。

默认的 `spring.config.name` 为 `application`，默认的 `spring.config.location` 为 `classpath:/,classpath:/config/,file:./, file:./config/*/, file:./config/`，优先级低的先加载，优先级高的后加载，覆盖前面的。优先级由高到低

1. `jar` 当前路径的 `config` 文件夹下
2. `jar` 当前路径的 `config` 子文件夹下，形如 `./config/my/application.properties`
3. `jar` 当前路径同级
4. `classpath` 类路径的 `config` 文件夹下
5. `classpath` 类路径下

如此，便可以解释所谓的 `外部配置优先于内部配置`，同样的，如果我们指定 `spring.config.location` 为 `file:./, classpath:/`，则表现出的就会是 `内部配置优先于外部配置`

另外，还可以指定 `spring.config.additional-location` 属性添加配置文件。当然，这部分配置文件也会倒序后被优先加载，比如说指定`spring.config.additional-location=file:./custom-config/,classpath:/custom-config/`,优先级由高到低

1. `classpath` 的 `custom-config` 文件夹下
2. `jar` 当前路径的 `custom-config` 文件夹下
3. `jar` 当前路径的 `config` 文件夹下
4. `jar` 当前路径的 `config` 文件夹子文件夹下，形如 `./config/my/application.properties`
5. `jar` 当前路径同级
6. `classpath` 类路径的 `config` 文件夹下
7. `classpath` 类路径下

## profile

可以以形如 `application-{profile}.properties` 的命名指定配置文件，默认 `profile` 为 `default` ,也就是`application.properties`。可通过 `spring.profiles.active` 属性激活对应的 `profile`

从文首给出的配置顺序可以看到，**激活的 `profile` 是优先于 `application.properties`**，且无关配置文件位置。换句话说，`jar` 内部 `application-{profile}.properties` 的属性也会覆盖` jar` 包外 `application.properties` 的对应属性（这是与 2.4.x 版本最大的不同之一，下文重点讨论）


## 2.4.0版本之后：

* `Command line arguments`

+ `Java System properties`

+ `OS environment variables`

+ `Profile-specific application properties outside of your packaged jar `

+ `Application properties outside of your packaged jar`
+ `Profile-specific application properties packaged inside your jar `
+ `Application properties packaged inside your jar `

## 配置文件

1. `jar` 当前路径的 `config` 子文件夹下，形如 `./config/my/application.properties`（变化之处）
2. `jar` 当前路径的 `config` 文件夹下
3. `jar` 当前路径同级
4. `classpath` 类路径的 `config` 文件夹下
5. `classpath` 类路径下

## optional

新的机制，对于上述 `spring.config.location spring.config.additional-location` 和之后要介绍的` spring.config.import `等属性的路径，添加 `optional: `前缀，则当对应文件不存在时应用仍可以正常启动

比如` spring.config.location=optional:file:/my.yaml`，当应用启动加载文件 `my.yaml` 不存在时，不会抛出异常

## import

新的机制，这也是一个比较重要的机制，在配置文件中通过`  spring.config.import`  属性可以引入指定的配置文件，比如 ` spring.config.import=my.yaml` 

上述示例中，它会将` my.yaml`  文件作为临时文件放在当前配置文件之后处理，因此其属性具有更高的优先级，比如：

```YAML
name: default
spring:
	config:
		import: my.yaml
```

则 `my.yaml` 文件中的属性 `name` 会覆盖此文件中的值： `default`

补充如下细节：

- 无论声明多少次，同一个文件只会被 `import` 一次
- `import` 文件的优先级与其声明的位置无关，即无论如何，它内部的属性优先级都是高于当前文件的
- 如果 `import` 多个文件，则之后文件的属性优先级更高

## profile

同样的，可以以形如 application-{profile}.properties 的命名指定配置文件，默认 profile 为 default，可通过 ` spring.profiles.active`  属性激活对应的 ` profile` 

在 2.4.0 版本之前，` profile`  的优先级是大于位置的，如何理解这句话：比如 jar 包内 ` application-${profile}.yaml ` 的属性优先级是大于 ` jar ` 包外 ` application.yaml`  同名属性的

**但在 2.4.x 版本后，位置的优先级将大于 profile**，比如属性优先级依次如下：

1. jar 包外 ` application-${profile}.yaml`  属性

2. jar 包外 ` application.yaml`  属性

3. jar 包内 ` application-${profile}.yaml` 属性

4. jar 包内 ` application.yaml ` 属性

   对比之前，这样的优先级划分其实才是更合理的，也是容器时代下需要支持的外部化配置独立于内部的配置

## 总结：

1. `jar` 包外 `config` 子文件夹下的配置文件属性优先级提为最高，我们之前提到，这更符合 `外部化配置` 的思想，这样我们就可以更好的整合、梳理配置文件
2. `配置文件位置` 优先于 `profile`，此举主要是把内部配置文件和外部配置文件分离开来，比如在 `2.4.0` 之前，`jar` 内部的 `application-${profile}.yaml` 文件属性是可以覆盖外部 `application.yaml` 的，这显然不是很合理
3. `optional:` 前缀的支持，包容了目标配置文件不存在的情况
4. `spring.config.import` 属性，这应该是本次更新的重头戏，经常使用容器化部署的同学应该可以感受到，这是对容器化部署的大力支持：无论是对 `挂载 volume` 文件的读取支持，亦或是对诸如 `ConfigMap` 组件的解析支持
5. 对于单文件多 `profile` 模式的配置文件不做深入了解，因为我觉得这种配置方式并不是很友好，看起来显得杂乱无章