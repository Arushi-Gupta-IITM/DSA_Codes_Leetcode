/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head == NULL) return NULL;

        Node* copyHead = new Node(head->val);
        unordered_map<Node*, Node*> mp;
        mp[head] = copyHead;

        Node* temp1 = head->next;
        Node* temp2 = copyHead;

        while(temp1 != NULL) {
            Node* copyNode = new Node(temp1->val);
            temp2->next = copyNode;
            mp[temp1] = copyNode;

            temp1 = temp1->next;
            temp2 = temp2->next;
        }

        temp1 = head;
        temp2 = copyHead;

        while(temp1 != NULL) {
            temp2->random = mp[temp1->random];

            temp1 = temp1->next;
            temp2 = temp2->next;
        }

        return copyHead;
    }
};