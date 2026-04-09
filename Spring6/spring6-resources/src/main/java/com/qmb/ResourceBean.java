package com.qmb;

import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;

public class ResourceBean {

    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void res() throws IOException {
        System.out.println(resource.getFilename());
        System.out.println(resource.getURL());
        InputStreamReader isr = new InputStreamReader(resource.getInputStream());
        char[] read = new char[1024*2];
        int len;
        if ((len = isr.read(read)) != -1) {
            for (int i = 0; i < len; i++) {
                System.out.print(read[i]);
            }
        }
    }
}
