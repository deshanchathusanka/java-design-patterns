package org.structural.adapter;

public class Adapter implements ITarget {
    private final IService service;

    public Adapter(IService service) {
        this.service = service;
    }

    public String hello() {
        return service.hello();
    }
}
