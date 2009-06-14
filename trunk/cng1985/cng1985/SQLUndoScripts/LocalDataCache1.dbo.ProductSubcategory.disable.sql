IF EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[ProductSubcategory]')) 
   ALTER TABLE [dbo].[ProductSubcategory] 
   DISABLE  CHANGE_TRACKING
GO
