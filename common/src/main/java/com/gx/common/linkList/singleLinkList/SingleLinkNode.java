package com.gx.common.linkList.singleLinkList;


/**
 * 单链表 节点
 */
public class SingleLinkNode<T> implements Cloneable {

    private T value;

    private SingleLinkNode<T> nextNode;

    private SingleLinkNode<T> preNode;

    public SingleLinkNode(T value) {
        this.value = value;
    }

    public SingleLinkNode() {
    }

    public <T> T getValue() {
        return (T) value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleLinkNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(SingleLinkNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public SingleLinkNode<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(SingleLinkNode<T> preNode) {
        this.preNode = preNode;
    }


    @Override
    public T clone() {
        T obj = null;
        try {
            obj = (T) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
