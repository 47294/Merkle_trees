package binaree_tree;

public class test_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binary_tree<Integer> tree = new binary_tree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);

        System.out.println("�������� 3: " + tree.contains(3));
        System.out.println("�������� 8: " + tree.contains(8)); 

        binary_tree<Integer> copiedTree = new binary_tree<>(tree);
        System.out.println("������ ������������� ������: " + copiedTree.size());

        tree.clear();
        System.out.println("�������������� ������ ������ ����� �������: " + tree.size()); 

        System.out.println("������������� ������ ������ ����� ������� ��������� ������: " + copiedTree.size());
    }
}