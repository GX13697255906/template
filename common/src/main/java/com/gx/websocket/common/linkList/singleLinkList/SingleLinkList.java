package com.gx.websocket.common.linkList.singleLinkList;

/**
 * 单链表
 */
public class SingleLinkList {

    /**
     * 初始节点
     */
    public SingleLinkNode origNode = null;

    public SingleLinkNode origOperNode = null;

    public SingleLinkNode tempNode = null;

    public Integer size = 0;

    public Integer count = 0;

    public Integer delCount = 0;

    public SingleLinkNode next = null;

    public SingleLinkNode pre = null;

    private Integer add() {
        return size = size + 1;
    }

    private Integer sub() {
        if (size >= 1) {
            return size = size - 1;
        } else {
            size = 0;
            return 0;
        }
    }

    public void add(Integer value) {
        add();
        SingleLinkNode newNode = new SingleLinkNode<Integer>(value);
        if (origNode == null) {
            origNode = newNode;
            tempNode = newNode;
        } else {
            newNode.setPreNode(tempNode);
            tempNode.setNextNode(newNode);
            tempNode = newNode;
        }
//        这里将origNode复制一个新的对象给origOperNode,创建新的对象，避免用=号造成的操作同一个对象
        origOperNode = (SingleLinkNode) origNode.clone();
    }

    /**
     * 递归算法遍历
     */
    public void showAll() {
        if (origOperNode != null) {
            System.out.println(origOperNode.getValue());
            origOperNode = origOperNode.getNextNode();
            count = count + 1;
            if (count <= size) {
                showAll();
            } else {
//                跳出递归算法后重置 操作节点 origOperNode 和 计数器 count
                origOperNode = (SingleLinkNode) origNode.clone();
                count = 0;
            }
        }
    }

    /**
     * 使用递归算法 遍历查询指定下标的节点
     *
     * @param index
     */
    public Integer getByIndex(int index) {
        Integer indexValue = null;
        if (origNode == null || size == 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (origOperNode == null) {
                origOperNode = (SingleLinkNode) origNode.clone();
                count = 0;
            }
            if (count == index) {
                indexValue = (Integer) origOperNode.getValue();
                count = count + 1;
            } else {
                origOperNode = origOperNode.getNextNode();
                count = count + 1;
                indexValue = getByIndex(index);
            }

        }
        return indexValue;
    }

    public void removeByIndex(int index) {
        if (origNode == null || size == 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            if (next == null) {
                next = origNode;
            }
            if (index != 0) {
                if (delCount == index - 1) {
                    next.setNextNode(next.getNextNode().getNextNode());
                    System.out.println("removeByIndex = " + next.getValue());
                    origOperNode = origNode;
                    sub();
                }
                if (delCount != index) {
                    next = next.getNextNode();
                    delCount = delCount + 1;
                    removeByIndex(index);
                }
            } else {
                origNode = origNode.getNextNode();
                origOperNode = origNode;
                sub();
            }
        }
    }


    public static void main(String[] args) {
        SingleLinkList linkList = new SingleLinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        linkList.add(6);
        linkList.showAll();
        Integer indexValue = linkList.getByIndex(0);
        System.out.println("indexValue = " + indexValue);
        System.out.println("linkList.size = " + linkList.size);
        linkList.removeByIndex(4);
        linkList.showAll();
    }


}
