IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[ProductSubcategory]')) 
   ALTER TABLE [dbo].[ProductSubcategory] 
   ENABLE  CHANGE_TRACKING
GO
