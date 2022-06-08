import javax.swing.JOptionPane;

public class Land{
	public static void main (String[] args){

		String first_num, second_num;
		double length,width,area;
		final double inch = 2.54;

		first_num = JOptionPane.showInputDialog("Enter the length");
		second_num = JOptionPane.showInputDialog("Enter the width");

		length = Double.parseDouble(first_num);
		width = Double.parseDouble(second_num);

		length = length*inch;
		width = width*inch;

		area = length*width;

		JOptionPane.showMessageDialog(null, "The width is " + width + ", the length is " + length + " and the total area is " + area , "Total Area", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
	}
}