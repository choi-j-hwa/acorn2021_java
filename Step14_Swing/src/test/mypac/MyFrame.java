package test.mypac;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	//생성자i 
	public MyFrame() {
		//Object-Component-Container-Window-Frame-Jframe 생성자루트 
		//컨트롤+space 누르면가능한 필드와 메소드 엄청뜸 왜냐 받은게 많아서		
		this.setLayout(null); //상속받았자나 this.이 다 생략된거
		JButton btn=new JButton("눌러보셈");
		btn.setBounds(50, 50, 100, 40);
		add(btn);
		Component c=new JButton();
		ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//바깥에 감싸고 있는 클래스의 참조값은 바깥클래스명.this 이다 
				JOptionPane.showMessageDialog( MyFrame.this , "버튼을 눌렀네?");
			}
		};
		//지역변수에 저장된 ActionListener 객체의 참조값 전달 
		btn.addActionListener(listener);
		//전송 버튼 추가 
		JButton sendBtn=new JButton("전송");
		sendBtn.setBounds(200, 50, 100, 40);
		add(sendBtn);
		//필드에 있는 ActionListener 등록하기 
		sendBtn.addActionListener(sendListener);
	}//생성자 닫는 중괄호
	
	//ActionListener 객체의 참조값을 필드에 저장하기 
	ActionListener sendListener=new ActionListener() {	
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(MyFrame.this, "전송합니다.");
		}
	};
	
}//클래스를 닫는 중괄호 





