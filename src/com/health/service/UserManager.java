package com.health.service;

//import org.leegang.hrsystem.vo.*;
//import org.leegang.hrsystem.model.*;
//import org.leegang.hrsystem.exception.*;

import java.util.*;

/**
 * Description:
 * <br/>Copyright (C), 2001-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public interface UserManager
{
    //��½ʧ��
	public static final int LOGIN_FAIL = 0;
	//����ͨԱ����½
	public static final int LOGIN_EMP = 1;
	//�Ծ�����½
	public static final int LOGIN_MGR = 2;

	//���ܴ�
	public static final int NO_PUNCH = 0;
	//ֻ���ϰ��
	public static final int COME_PUNCH = 1;
	//ֻ���°��
	public static final int LEAVE_PUNCH = 2;
	//�ȿ����ϰ࣬Ҳ�����°��
	public static final int BOTH_PUNCH = 3;

	//��ʧ��
	public static final int PUNCH_FAIL = 0;
	//�Ѿ���
	public static final int PUNCHED = 1;
	//�򿨳ɹ�
	public static final int PUNCH_SUCC = 2;

	//������11��Ϊ����ʱ��
	public static final int AM_LIMIT = 11;

    
	//������9��֮ǰΪ�����ϰ�
	public static final int COME_LIMIT = 9;
	//������9~11��֮����ٵ�
	public static final int LATE_LIMIT = 11;
	//������18��֮���������°�
	public static final int LEAVE_LIMIT = 18;
	//������16~18��֮����ٵ�
	public static final int EARLY_LIMIT = 16;

	/**
	 * ��֤��½
	 * @param user ��½�õ��û���
	 * @param pass ��½�õ�����
	 * @return ��½�������ȷ��:0Ϊ��½ʧ�ܣ�1Ϊ��½emp 2Ϊ��½mgr
	 */
	int validLogin(String user , String pass);

	/**
	 * �Զ��򿨣���һ�����壬����7��00Ϊÿ��Ա�����������¼
	 */
	void autoPunch();

	/**
	 * �Զ����㹤�ʣ�ÿ��1�ţ������ϸ��¹���
	 */
	void autoPay();


	/**
	 * ��֤ĳ��Ա���Ƿ�ɴ�
	 * @param user Ա����
	 * @param dutyDay ����
	 * @return �ɴ򿨵����
	 */
	int validPunch(String user , String dutyDay);

	/**
	 * ��
	 * @param user Ա����
	 * @param dutyDay ������
	 * @param isCome �Ƿ����ϰ��
	 * @return �򿨽��
	 */
	public int punch(String user , String dutyDay , boolean isCome);

	/**
	 * ����Ա������Լ��Ĺ���
	 * @param empName Ա����
	 * @return ��Ա���Ĺ����б�
	 */
	
}