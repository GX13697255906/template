package com.gx.websocket.common.linkList.doubleLinkList;


/**
 * 双向链表 节点
 */
public class DoubleLinkNode<T> implements Cloneable {

    private T value;

    private DoubleLinkNode<T> nextNode;

    private DoubleLinkNode<T> preNode;

    public DoubleLinkNode(T value) {
        this.value = value;
    }

    public DoubleLinkNode() {
    }

    public <T> T getValue() {
        return (T) value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public DoubleLinkNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleLinkNode<T> getPreNode() {
        return preNode;
    }

    public void setPreNode(DoubleLinkNode<T> preNode) {
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
