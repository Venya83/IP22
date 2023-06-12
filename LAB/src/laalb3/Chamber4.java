package laalb3;
import javax.swing.*;
import java.awt.*;

public class Chamber4 {
	public static void main(String[] args) {
		animal elephant = new animal();
		elephant.mass = 5000;
		elephant.food();
		System.out.println(elephant.mass);
	}
}

class animal
{
	int mass;
	void food()
	{
		mass = mass+1;
	}
}