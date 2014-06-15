package com.jp.bean;

import java.util.Vector;

import com.jp.ui.ChessPoint;

import static com.jp.ui.ChessPoint.BLACKCHESS;
import static com.jp.ui.ChessPoint.NOCHESS;
import static com.jp.ui.ChessPoint.WHITECHESS;

/**
 *  Road�࣬ͨ�����塰·������������������жϵ�����
 *  @author ����
 */

public class Road {
//
//  ʵ������
//
	/** ��ǰ·��Ч����������ӵ���ɫ�������Ч��������ɫΪ������״̬ */
	private char chessColor=ChessPoint.NOCHESS;
	/** ��ǰ��Ч·�����ӵĸ��� */
	private int validChessCount=0;
	/** ��ǰ��·�����ӵ���Ϣ */
	private Vector<Character> chesses=new Vector<>(6);
//
//  ���췽��
//
	public Road(Vector<Character> chesses) {
		this.chesses=chesses;
		int bChessNum=0;
		int wChessNum=0;
		for(Character c:chesses){
			//�����������ģ�Ͳ����ڣ������κ��ж�
			if(c==NOCHESS){
				continue;
			}
			if(c==BLACKCHESS){
				bChessNum++;
			}
			if(c==WHITECHESS){
				wChessNum++;
			}
		}
		if(bChessNum>0 && wChessNum==0){
			this.chessColor=BLACKCHESS;
			this.validChessCount=bChessNum;
		}
		if(wChessNum>0 && bChessNum==0){
			this.chessColor=WHITECHESS;
			this.validChessCount=wChessNum;
		}
	}
//
//  ��ѯ������ʵ�����Եķ���
//
	/** 
	 * getChessColor��ȡ��ǰ·����ɫ
	 * @return chessColor ChessPoint.BLACKCHESS��'b'������ǰ��·Ϊ������·��
	 *  	ChessPoint.WHITECHESS��'w'������ǰ��·Ϊ������·��ChessPoint.NOCHESS
	 *  	��'n'������ǰ��·��Ч
	 */
	public char getChessColor() {
		return chessColor;
	}
	/**
	 * getValidChessCount��ȡ��ǰ��Ч·����Ч���Ӹ���
	 * @return validChessCount ��Ч·����Ч���ӵĸ���
	 */
	public int getValidChessCount() {
		return validChessCount;
	}
	/**
	 * getChess��ȡ��ǰ·�����ӵ���Ϣ
	 * @return chesses ��ǰ·�е�������Ϣ
	 */
	public Vector<Character> getChesses() {
		return chesses;
	}
	
}