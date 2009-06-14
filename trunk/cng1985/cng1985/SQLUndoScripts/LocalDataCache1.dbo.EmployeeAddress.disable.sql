IF EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[EmployeeAddress]')) 
   ALTER TABLE [dbo].[EmployeeAddress] 
   DISABLE  CHANGE_TRACKING
GO
