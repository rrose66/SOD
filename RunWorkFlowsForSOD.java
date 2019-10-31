package run;

import java.io.IOException;

public class RunWorkFlowsForSOD 
{

	public static void main(String[] args) 
	{
		java.lang.Process runProcess;
		String strStartAlteryx="C:\\Program Files\\Alteryx\\bin\\AlteryxEngineCmd.exe";
		String strAlteryxRepository="C:\\PROJECTS\\GitHub\\SOD\\SOD_v14\\";
		try 
		{
			String[] strRunAlteryxWfcmd01 = {strStartAlteryx, strAlteryxRepository + "Code Promoters with Scheduler.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd01);
			String[] strRunAlteryxWfcmd02 = {strStartAlteryx, strAlteryxRepository + "Code Promoters with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd02);
			String[] strRunAlteryxWfcmd03 = {strStartAlteryx, strAlteryxRepository + "Code Promotors with Security Administrator.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd03);
			String[] strRunAlteryxWfcmd04 = {strStartAlteryx, strAlteryxRepository + "Code Promotors with User.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd04);
			String[] strRunAlteryxWfcmd05 = {strStartAlteryx, strAlteryxRepository + "DBA with Non DBA Roles.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd05);
			String[] strRunAlteryxWfcmd06 = {strStartAlteryx, strAlteryxRepository + "DBA with Prod.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd06);
			String[] strRunAlteryxWfcmd07 = {strStartAlteryx, strAlteryxRepository + "DBAs with Owner.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd07);
			String[] strRunAlteryxWfcmd08 = {strStartAlteryx, strAlteryxRepository + "DBAs with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd08);
			String[] strRunAlteryxWfcmd09 = {strStartAlteryx, strAlteryxRepository + "DBAs with System Analyst.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd09);
			String[] strRunAlteryxWfcmd10 = {strStartAlteryx, strAlteryxRepository + "Owners with DBA.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd10);
			String[] strRunAlteryxWfcmd11 = {strStartAlteryx, strAlteryxRepository + "Owners with QA.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd11);
			String[] strRunAlteryxWfcmd12 = {strStartAlteryx, strAlteryxRepository + "Owners with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd12);
			String[] strRunAlteryxWfcmd13 = {strStartAlteryx, strAlteryxRepository + "Schedulers with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd13);
			String[] strRunAlteryxWfcmd14 = {strStartAlteryx, strAlteryxRepository + "SE with Data Owner.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd14);
			String[] strRunAlteryxWfcmd15 = {strStartAlteryx, strAlteryxRepository + "SE with DBA.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd15);
			String[] strRunAlteryxWfcmd16 = {strStartAlteryx, strAlteryxRepository + "SE with Prod.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd16);
			String[] strRunAlteryxWfcmd17 = {strStartAlteryx, strAlteryxRepository + "SE with QA Control.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd17);
			String[] strRunAlteryxWfcmd18 = {strStartAlteryx, strAlteryxRepository + "SE with Scheduler.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd18);
			String[] strRunAlteryxWfcmd19 = {strStartAlteryx, strAlteryxRepository + "SE with Security Administrator.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd19);
			String[] strRunAlteryxWfcmd20 = {strStartAlteryx, strAlteryxRepository + "Security with Code Promotor.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd20);
			String[] strRunAlteryxWfcmd21 = {strStartAlteryx, strAlteryxRepository + "Security with Scheduler.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd21);
			String[] strRunAlteryxWfcmd22 = {strStartAlteryx, strAlteryxRepository + "Security with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd22);
			String[] strRunAlteryxWfcmd23 = {strStartAlteryx, strAlteryxRepository + "Security with System Analyst.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd23);
			String[] strRunAlteryxWfcmd24 = {strStartAlteryx, strAlteryxRepository + "Security with User.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd24);
			String[] strRunAlteryxWfcmd25 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Database Administrator.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd25);
			String[] strRunAlteryxWfcmd26 = {strStartAlteryx, strAlteryxRepository + "System Analyst with End User.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd26);
			String[] strRunAlteryxWfcmd27 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Production.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd27);
			String[] strRunAlteryxWfcmd28 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Program Migration Control 3F.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd28);
			String[] strRunAlteryxWfcmd29 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Security Administrator.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd29);
			String[] strRunAlteryxWfcmd30 = {strStartAlteryx, strAlteryxRepository + "Users with Code Promotor.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd30);
			String[] strRunAlteryxWfcmd31 = {strStartAlteryx, strAlteryxRepository + "Users with DBA.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd31);
			String[] strRunAlteryxWfcmd32 = {strStartAlteryx, strAlteryxRepository + "Users with QA.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd32);
			String[] strRunAlteryxWfcmd33 = {strStartAlteryx, strAlteryxRepository + "Users with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd33);
			String[] strRunAlteryxWfcmd34 = {strStartAlteryx, strAlteryxRepository + "Users with Security Administration.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd34);
			String[] strRunAlteryxWfcmd35 = {strStartAlteryx, strAlteryxRepository + "QA with SE.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd35);
			String[] strRunAlteryxWfcmd36 = {strStartAlteryx, strAlteryxRepository + "QA with Promotor.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd36);
			String[] strRunAlteryxWfcmd37 = {strStartAlteryx, strAlteryxRepository + "DBA outside of IT Team.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd37);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}


	}

}
