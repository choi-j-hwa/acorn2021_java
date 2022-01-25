package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class hFrame extends JFrame implements ActionListener {
	//String type을 인자로 전달받는 생성자 
	public hFrame(String title) {
		super(title);
		//레이아웃 법칙 지정하기
		setLayout(new FlowLayout());
		//버튼생성과 추가하기
		JButton runbtn=new JButton("달리기");
		this.add(runbtn); //this. 생략가능
		runbtn.addActionListener(this); //implememts 안하면 에러나 그후 hFrame에서 오버라이드
	}
	public static void main(String[] args) {
		 hFrame f=new hFrame("JHFrame");
	      f.setBounds(100, 100, 500, 300);
	      f.setVisible(true);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Let's go RUN!!");		
	}
}
