package binaree_tree;

class Node<T extends Comparable<T>> {
    T data;
    Node<T> left;
    Node<T> right;

    public Node(T data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class binary_tree<T extends Comparable<T>> {
	private Node<T> root;
    private int size;

    public binary_tree() {
        root = null;
        size = 0;
    }

    public binary_tree(binary_tree<T> original) {
        root = clone(original.root);
        size = original.size;
    }

    private Node<T> clone(Node<T> node) {
        if (node == null) {
            return null;
        }
        Node<T> newNode = new Node<>(node.data);
        newNode.left = clone(node.left);
        newNode.right = clone(node.right);
        return newNode;
    }

    public void add(T data) {
        root = insert(root, data);
        size++;
    }

    private Node<T> insert(Node<T> node, T data) {
        if (node == null) {
            return new Node<>(data);
        }

        int cmp = data.compareTo(node.data);

        if (cmp < 0) {
            node.left = insert(node.left, data);
        } else if (cmp > 0) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public boolean contains(T data) {
        return search(root, data);
    }

    private boolean search(Node<T> node, T data) {
        if (node == null) {
            return false;
        }

        int cmp = data.compareTo(node.data);

        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return search(node.left, data);
        } else {
            return search(node.right, data);
        }
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}
