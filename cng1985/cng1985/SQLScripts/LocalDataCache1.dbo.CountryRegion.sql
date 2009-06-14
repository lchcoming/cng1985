IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[CountryRegion]')) 
   ALTER TABLE [dbo].[CountryRegion] 
   ENABLE  CHANGE_TRACKING
GO
