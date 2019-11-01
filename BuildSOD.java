package etl;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class BuildSOD 
{

	public static void main(String[] args) 
	{
		Integer intDialogButton=0;
		String strMsg=null;
		java.lang.Process runProcess;
		String strStartAlteryx="C:\\Program Files\\Alteryx\\bin\\AlteryxEngineCmd.exe";
		String strAlteryxRepository="C:\\PROJECTS\\GitHub\\SOD\\SOD_v15\\ALTERYX\\";
		String strAllConflict = "C:\\PROJECTS\\DATA\\SOD\\CONFLICTS\\ALL_CONFLICTS.XLSX";
//		try 
//		{
//			String[] strRunAlteryxWfProductionUserDataSavingChangesOnly = {strStartAlteryx, strAlteryxRepository + "PRODUCTION_USER_DATA_SAVING_CHANGES_ONLY.yxmd"};
//			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfProductionUserDataSavingChangesOnly);
//			WaitUntilThisFileIsWritable("C:\\PROJECTS\\DATA\\ORACLE\\N_FEDEBOM_PRODUCTION_USERS.csv");
//		}
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}

		intDialogButton=JOptionPane.YES_NO_CANCEL_OPTION;
		strMsg = "Click Yes after:";
		strMsg = strMsg + "\n Click Yes after manually deleting all records from Conflicts";
		intDialogButton=JOptionPane.showConfirmDialog(null, strMsg,"Has all the records from Conflicts been deleted?",intDialogButton);
		if(intDialogButton == 0)
		{
			String[] strRunAlteryxWfProductionUserDataSavingChangesOnly = {strStartAlteryx, strAlteryxRepository + "PRODUCTION_USER_DATA_SAVING_CHANGES_ONLY.yxmd"};
			try 
			{
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfProductionUserDataSavingChangesOnly);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			WaitUntilThisFileIsWritable("C:\\PROJECTS\\DATA\\ORACLE\\N_FEDEBOM_PRODUCTION_USERS.csv");
		}
		
		intDialogButton=JOptionPane.YES_NO_CANCEL_OPTION;
		strMsg = "Click Yes after:";
		strMsg = strMsg + "\n Click Yes after manually deleting FEDEBOM_PRODUCTION_USERS.csv and renaming N_FEDEBOM_PRODUCTION_USERS.csv";
		intDialogButton=JOptionPane.showConfirmDialog(null, strMsg,"Has the N_FEDEBOM_PRODUCTION_USERS been renamed?",intDialogButton);
		if(intDialogButton == 0)
		{
			try
			{
			String[] strRunAlteryxWfCreateOracleCdsidTxtForCdsidLookup = {strStartAlteryx, strAlteryxRepository + "CREATE_ORACLE_CDSID_TXT_FOR_CDSID_LOOKUP.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfCreateOracleCdsidTxtForCdsidLookup);
			WaitUntilThisFileIsWritable("C:\\PROJECTS\\GitHub\\SOD\\SOD_v15\\CLEAN_SOURCES_OF_TRUTH\\ORACLE_CDSID.txt");
			String[] strRunAlteryxWfUniqueSortedCdsidInputs = {strStartAlteryx, strAlteryxRepository + "UNIQUE_SORTED_CDSID_INPUTS.yxmd"};
			runProcess = Runtime.getRuntime().exec(strRunAlteryxWfUniqueSortedCdsidInputs);
			WaitUntilThisFileIsWritable("C:\\PROJECTS\\GitHub\\SOD\\SOD_v15\\WIP\\CDSID_FOR_LOOKUP_TOOL.csv");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		intDialogButton=JOptionPane.YES_NO_CANCEL_OPTION;
		strMsg = "Before clicking Yes:";
		strMsg = strMsg + "\n Open the CDSID_FOR_LOOKUP_TOOL";
		strMsg = strMsg + "\n Rename the last CDSID Lookup Tool with yyyymmdd";
		strMsg = strMsg + "\n Copy the CDSID Lookup Tool from Templates and paste it into WIP";
		strMsg = strMsg + "\n Open the Lookup Tool then paste the results into it";
		strMsg = strMsg + "\n Click Run on the Tool";
		strMsg = strMsg + "\n When it is complete save it";
		strMsg = strMsg + "\n Clean the results by running CLEAN_CDSID_LOOKUP_RESULTS.YXMD";
		strMsg = strMsg + "\n Identify the changes since the last run and research roles and access level";
		strMsg = strMsg + "\n Manually backup the IT Team master then replace it with the new master";
		strMsg = strMsg + "\n to run all the Alteryx work flows that generate data for the SOD";
		intDialogButton=JOptionPane.showConfirmDialog(null, strMsg,"Run all the Conflict work flows?",intDialogButton);
		if(intDialogButton == 0)
		{
			try
			{
				String[] strRunAlteryxWfcmd01 = {strStartAlteryx, strAlteryxRepository + "Code Promoters with Scheduler.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd01);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd02 = {strStartAlteryx, strAlteryxRepository + "Code Promoters with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd02);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd03 = {strStartAlteryx, strAlteryxRepository + "Code Promotors with Security Administrator.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd03);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd04 = {strStartAlteryx, strAlteryxRepository + "Code Promotors with User.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd04);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd05 = {strStartAlteryx, strAlteryxRepository + "DBA with Non DBA Roles.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd05);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd06 = {strStartAlteryx, strAlteryxRepository + "DBA with Prod.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd06);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd07 = {strStartAlteryx, strAlteryxRepository + "DBAs with Owner.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd07);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd08 = {strStartAlteryx, strAlteryxRepository + "DBAs with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd08);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd09 = {strStartAlteryx, strAlteryxRepository + "DBAs with System Analyst.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd09);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd10 = {strStartAlteryx, strAlteryxRepository + "Owners with DBA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd10);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd11 = {strStartAlteryx, strAlteryxRepository + "Owners with QA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd11);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd12 = {strStartAlteryx, strAlteryxRepository + "Owners with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd12);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd13 = {strStartAlteryx, strAlteryxRepository + "Schedulers with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd13);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd14 = {strStartAlteryx, strAlteryxRepository + "SE with Data Owner.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd14);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd15 = {strStartAlteryx, strAlteryxRepository + "SE with DBA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd15);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd16 = {strStartAlteryx, strAlteryxRepository + "SE with Prod.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd16);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd17 = {strStartAlteryx, strAlteryxRepository + "SE with QA Control.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd17);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd18 = {strStartAlteryx, strAlteryxRepository + "SE with Scheduler.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd18);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd19 = {strStartAlteryx, strAlteryxRepository + "SE with Security Administrator.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd19);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd20 = {strStartAlteryx, strAlteryxRepository + "Security with Code Promotor.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd20);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd21 = {strStartAlteryx, strAlteryxRepository + "Security with Scheduler.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd21);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd22 = {strStartAlteryx, strAlteryxRepository + "Security with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd22);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd23 = {strStartAlteryx, strAlteryxRepository + "Security with System Analyst.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd23);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd24 = {strStartAlteryx, strAlteryxRepository + "Security with User.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd24);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd25 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Database Administrator.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd25);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd26 = {strStartAlteryx, strAlteryxRepository + "System Analyst with End User.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd26);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd27 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Production.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd27);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd28 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Program Migration Control 3F.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd28);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd29 = {strStartAlteryx, strAlteryxRepository + "System Analyst with Security Administrator.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd29);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd30 = {strStartAlteryx, strAlteryxRepository + "Users with Code Promotor.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd30);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd31 = {strStartAlteryx, strAlteryxRepository + "Users with DBA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd31);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd32 = {strStartAlteryx, strAlteryxRepository + "Users with QA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd32);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd33 = {strStartAlteryx, strAlteryxRepository + "Users with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd33);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd34 = {strStartAlteryx, strAlteryxRepository + "Users with Security Administration.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd34);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd35 = {strStartAlteryx, strAlteryxRepository + "QA with SE.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd35);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd36 = {strStartAlteryx, strAlteryxRepository + "QA with Promotor.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd36);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd37 = {strStartAlteryx, strAlteryxRepository + "DBA outside of IT Team.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd37);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd38 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with DBA.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd38);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd39 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with D4S2.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd39);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd40 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with AccuRev.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd40);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd41 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with I6S1.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd41);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd42 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with Security.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd42);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd43 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with Scheduler.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd43);
				WaitUntilThisFileIsWritable(strAllConflict);			
				String[] strRunAlteryxWfcmd44 = {strStartAlteryx, strAlteryxRepository + "Non IT Members with User.yxmd"};
				runProcess = Runtime.getRuntime().exec(strRunAlteryxWfcmd44);
				WaitUntilThisFileIsWritable(strAllConflict);			
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		System.out.println("Done.  Now manually run the DATA_TO_PASTE_INTO_SOD work flow");
		}
	}

	public static void WaitUntilThisFileIsWritable(String strFullPath)
	{
		Boolean blnReadyToContinue=false;
		while(blnReadyToContinue==false)
		{
			File f = new File(strFullPath);
			try 
			{
				Thread.sleep(6000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			if(f.canWrite())
			{
				blnReadyToContinue=true;
			}
		}

		
	}

}
