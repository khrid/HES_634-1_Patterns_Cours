package ex2_swissmilitary.handler;

import ex2_swissmilitary.request.PermissionRequest;

public abstract class PermissionPower {
    protected final double base = 1;
    protected PermissionPower successor;

    public void setSuccessor(PermissionPower successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PermissionRequest request);
}
