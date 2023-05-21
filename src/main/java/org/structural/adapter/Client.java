package org.structural.adapter;

public class Client {
    private final ITarget adapter;

    public Client() {
        /* This dependency should be injected at runtime */
        this.adapter = new Adapter(new Service());
    }

    public String method() {
        return this.adapter.hello();
    }
}
