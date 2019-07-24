package interface_framework.itest.actions.interfaces;

import interface_framework.itest.actions.ResultForAction;

public abstract class AbstractTestObject {
    public AbstractTestObject(){}
    @Deprecated
    public void init(){}
    @Deprecated
    public ResultForAction checkBySelf(){
        return null;
    }
}
