package com.example.neohelloworld.Leet;

//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//
//        Return a deep copy of the list.

import java.util.HashMap;

public class CPListWithRandomPointers138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode node = head;
        HashMap<RandomListNode, RandomListNode> positionMap = new HashMap<>();

        while(node!=null){
            positionMap.put(node, new RandomListNode(node.label));
            node=node.next;
        }

        node = head;

        while(node!=null){
            positionMap.get(node).next = positionMap.get(node.next);
            positionMap.get(node).random = positionMap.get(node.random);
            node=node.next;
        }

        return positionMap.get(head);
    }
}
