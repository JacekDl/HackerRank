package exercises;

import java.io.*;
import java.util.*;

class LLNode{
	int data;
	LLNode next;
	
	LLNode(int d){
		data = d;
		next = null;
	}	
}

//https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
public class MoreLinkedList{

	public static LLNode removeDuplicates(LLNode head) {
		LLNode current = head;
		while(current.next != null) {
			while(current.data == current.next.data) {
				if(current.next.next != null) current.next = current.next.next;
				else {
					current.next = null;
					break;
				}
			}
			if(current.next != null) current = current.next;	
		}
		return head;
	}

	public static LLNode insert(LLNode head, int data){
		LLNode p = new LLNode(data);			
		if(head == null) head = p;
		else if(head.next == null) head.next = p;
		else{
			LLNode start = head;
			while(start.next != null){
				start = start.next;
			}
			start.next = p;
		}
		return head;
	}
	
	public static void display(LLNode head){
		LLNode start = head;
		while(start != null){
			System.out.print(start.data + " ");
			start = start.next;
		}
	}
	
	public static void main(String args[]){
		LLNode head = null;
		head = insert(head, 1);
		head = insert(head, 1);
		head = insert(head, 1);
		head = insert(head, 1);
		head = insert(head, 1);
		head = insert(head, 1);
	
		display(head);
		System.out.println();
		head=removeDuplicates(head);
		display(head);
	}
}
