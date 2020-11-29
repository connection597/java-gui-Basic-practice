package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPanelEx extends JFrame{
	ContentPanelEx(){
		setTitle("Contentpane과 JFrame"); //프레임 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 닫으면 프로그램 종료
		
		Container contentPane = getContentPane(); // 컨텐트 팬을 알아낸다
		contentPane.setBackground(Color.ORANGE);  //오랜지 배경설정
		contentPane.setLayout(new FlowLayout()); //컨텐트 팬에 FlowLayout 배치 관리자 달기
		
		contentPane.add(new JButton("OK"));  //버튼 달기
		contentPane.add(new JButton("cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150); //프레임 크기 300x150
		setVisible(true); //프레임 화면 출력
	}
	public static void main(String []args) {
		new ContentPanelEx();
	}

}
