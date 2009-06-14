IF EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[CountryRegion]')) 
   ALTER TABLE [dbo].[CountryRegion] 
   DISABLE  CHANGE_TRACKING
GO
