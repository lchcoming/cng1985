﻿//------------------------------------------------------------------------------
// <auto-generated>
//     此代码由工具生成。
//     运行时版本:2.0.50727.3053
//
//     对此文件的更改可能会导致不正确的行为，并且如果
//     重新生成代码，这些更改将会丢失。
// </auto-generated>
//------------------------------------------------------------------------------

[assembly: global::System.Data.Objects.DataClasses.EdmSchemaAttribute()]
[assembly: global::System.Data.Objects.DataClasses.EdmRelationshipAttribute("WorkModel", "FK_College_School", "School", global::System.Data.Metadata.Edm.RelationshipMultiplicity.ZeroOrOne, typeof(School.Models.School), "College", global::System.Data.Metadata.Edm.RelationshipMultiplicity.Many, typeof(School.Models.College))]
[assembly: global::System.Data.Objects.DataClasses.EdmRelationshipAttribute("WorkModel", "FK_Department_College", "College", global::System.Data.Metadata.Edm.RelationshipMultiplicity.ZeroOrOne, typeof(School.Models.College), "Department", global::System.Data.Metadata.Edm.RelationshipMultiplicity.Many, typeof(School.Models.Department))]
[assembly: global::System.Data.Objects.DataClasses.EdmRelationshipAttribute("WorkModel", "FK_Major_Department", "Department", global::System.Data.Metadata.Edm.RelationshipMultiplicity.ZeroOrOne, typeof(School.Models.Department), "Major", global::System.Data.Metadata.Edm.RelationshipMultiplicity.Many, typeof(School.Models.Major))]

// 原始文件名:
// 生成日期: 2009/6/13 17:03:11
namespace School.Models
{
    
    /// <summary>
    /// 架构中不存在 WorkEntities 的注释。
    /// </summary>
    public partial class WorkEntities : global::System.Data.Objects.ObjectContext
    {
        /// <summary>
        /// 请使用应用程序配置文件的“WorkEntities”部分中的连接字符串初始化新 WorkEntities 对象。
        /// </summary>
        public WorkEntities() : 
                base("name=WorkEntities", "WorkEntities")
        {
            this.OnContextCreated();
        }
        /// <summary>
        /// 初始化新的 WorkEntities 对象。
        /// </summary>
        public WorkEntities(string connectionString) : 
                base(connectionString, "WorkEntities")
        {
            this.OnContextCreated();
        }
        /// <summary>
        /// 初始化新的 WorkEntities 对象。
        /// </summary>
        public WorkEntities(global::System.Data.EntityClient.EntityConnection connection) : 
                base(connection, "WorkEntities")
        {
            this.OnContextCreated();
        }
        partial void OnContextCreated();
        /// <summary>
        /// 架构中不存在 College 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<College> College
        {
            get
            {
                if ((this._College == null))
                {
                    this._College = base.CreateQuery<College>("[College]");
                }
                return this._College;
            }
        }
        private global::System.Data.Objects.ObjectQuery<College> _College;
        /// <summary>
        /// 架构中不存在 Department 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<Department> Department
        {
            get
            {
                if ((this._Department == null))
                {
                    this._Department = base.CreateQuery<Department>("[Department]");
                }
                return this._Department;
            }
        }
        private global::System.Data.Objects.ObjectQuery<Department> _Department;
        /// <summary>
        /// 架构中不存在 Major 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<Major> Major
        {
            get
            {
                if ((this._Major == null))
                {
                    this._Major = base.CreateQuery<Major>("[Major]");
                }
                return this._Major;
            }
        }
        private global::System.Data.Objects.ObjectQuery<Major> _Major;
        /// <summary>
        /// 架构中不存在 School 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<School> School
        {
            get
            {
                if ((this._School == null))
                {
                    this._School = base.CreateQuery<School>("[School]");
                }
                return this._School;
            }
        }
        private global::System.Data.Objects.ObjectQuery<School> _School;
        /// <summary>
        /// 架构中不存在 sysdiagrams 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<sysdiagrams> sysdiagrams
        {
            get
            {
                if ((this._sysdiagrams == null))
                {
                    this._sysdiagrams = base.CreateQuery<sysdiagrams>("[sysdiagrams]");
                }
                return this._sysdiagrams;
            }
        }
        private global::System.Data.Objects.ObjectQuery<sysdiagrams> _sysdiagrams;
        /// <summary>
        /// 架构中不存在 VCollege 的注释。
        /// </summary>
        public global::System.Data.Objects.ObjectQuery<VCollege> VCollege
        {
            get
            {
                if ((this._VCollege == null))
                {
                    this._VCollege = base.CreateQuery<VCollege>("[VCollege]");
                }
                return this._VCollege;
            }
        }
        private global::System.Data.Objects.ObjectQuery<VCollege> _VCollege;
        /// <summary>
        /// 架构中不存在 College 的注释。
        /// </summary>
        public void AddToCollege(College college)
        {
            base.AddObject("College", college);
        }
        /// <summary>
        /// 架构中不存在 Department 的注释。
        /// </summary>
        public void AddToDepartment(Department department)
        {
            base.AddObject("Department", department);
        }
        /// <summary>
        /// 架构中不存在 Major 的注释。
        /// </summary>
        public void AddToMajor(Major major)
        {
            base.AddObject("Major", major);
        }
        /// <summary>
        /// 架构中不存在 School 的注释。
        /// </summary>
        public void AddToSchool(School school)
        {
            base.AddObject("School", school);
        }
        /// <summary>
        /// 架构中不存在 sysdiagrams 的注释。
        /// </summary>
        public void AddTosysdiagrams(sysdiagrams sysdiagrams)
        {
            base.AddObject("sysdiagrams", sysdiagrams);
        }
        /// <summary>
        /// 架构中不存在 VCollege 的注释。
        /// </summary>
        public void AddToVCollege(VCollege vCollege)
        {
            base.AddObject("VCollege", vCollege);
        }
    }
    /// <summary>
    /// 架构中不存在 WorkModel.College 的注释。
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="College")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class College : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 College 对象。
        /// </summary>
        /// <param name="id">ID 的初始值。</param>
        public static College CreateCollege(int id)
        {
            College college = new College();
            college.ID = id;
            return college;
        }
        /// <summary>
        /// 架构中不存在属性 ID 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// 架构中不存在属性 CollegeName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string CollegeName
        {
            get
            {
                return this._CollegeName;
            }
            set
            {
                this.OnCollegeNameChanging(value);
                this.ReportPropertyChanging("CollegeName");
                this._CollegeName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("CollegeName");
                this.OnCollegeNameChanged();
            }
        }
        private string _CollegeName;
        partial void OnCollegeNameChanging(string value);
        partial void OnCollegeNameChanged();
        /// <summary>
        /// 架构中不存在 School 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_College_School", "School")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public School School
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<School>("WorkModel.FK_College_School", "School").Value;
            }
            set
            {
                ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<School>("WorkModel.FK_College_School", "School").Value = value;
            }
        }
        /// <summary>
        /// 架构中不存在 School 的注释。
        /// </summary>
        [global::System.ComponentModel.BrowsableAttribute(false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityReference<School> SchoolReference
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<School>("WorkModel.FK_College_School", "School");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedReference<School>("WorkModel.FK_College_School", "School", value);
                }
            }
        }
        /// <summary>
        /// 架构中不存在 Department 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_Department_College", "Department")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityCollection<Department> Department
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedCollection<Department>("WorkModel.FK_Department_College", "Department");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedCollection<Department>("WorkModel.FK_Department_College", "Department", value);
                }
            }
        }
    }
    /// <summary>
    /// 架构中不存在 WorkModel.Department 的注释。
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="Department")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class Department : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 Department 对象。
        /// </summary>
        /// <param name="id">ID 的初始值。</param>
        public static Department CreateDepartment(int id)
        {
            Department department = new Department();
            department.ID = id;
            return department;
        }
        /// <summary>
        /// 架构中不存在属性 ID 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// 架构中不存在属性 DepartmentName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string DepartmentName
        {
            get
            {
                return this._DepartmentName;
            }
            set
            {
                this.OnDepartmentNameChanging(value);
                this.ReportPropertyChanging("DepartmentName");
                this._DepartmentName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("DepartmentName");
                this.OnDepartmentNameChanged();
            }
        }
        private string _DepartmentName;
        partial void OnDepartmentNameChanging(string value);
        partial void OnDepartmentNameChanged();
        /// <summary>
        /// 架构中不存在 College 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_Department_College", "College")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public College College
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<College>("WorkModel.FK_Department_College", "College").Value;
            }
            set
            {
                ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<College>("WorkModel.FK_Department_College", "College").Value = value;
            }
        }
        /// <summary>
        /// 架构中不存在 College 的注释。
        /// </summary>
        [global::System.ComponentModel.BrowsableAttribute(false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityReference<College> CollegeReference
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<College>("WorkModel.FK_Department_College", "College");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedReference<College>("WorkModel.FK_Department_College", "College", value);
                }
            }
        }
        /// <summary>
        /// 架构中不存在 Major 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_Major_Department", "Major")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityCollection<Major> Major
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedCollection<Major>("WorkModel.FK_Major_Department", "Major");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedCollection<Major>("WorkModel.FK_Major_Department", "Major", value);
                }
            }
        }
    }
    /// <summary>
    /// 架构中不存在 WorkModel.Major 的注释。
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="Major")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class Major : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 Major 对象。
        /// </summary>
        /// <param name="id">ID 的初始值。</param>
        public static Major CreateMajor(int id)
        {
            Major major = new Major();
            major.ID = id;
            return major;
        }
        /// <summary>
        /// 架构中不存在属性 ID 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// 架构中不存在属性 MajorName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string MajorName
        {
            get
            {
                return this._MajorName;
            }
            set
            {
                this.OnMajorNameChanging(value);
                this.ReportPropertyChanging("MajorName");
                this._MajorName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("MajorName");
                this.OnMajorNameChanged();
            }
        }
        private string _MajorName;
        partial void OnMajorNameChanging(string value);
        partial void OnMajorNameChanged();
        /// <summary>
        /// 架构中不存在 Department 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_Major_Department", "Department")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public Department Department
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Department>("WorkModel.FK_Major_Department", "Department").Value;
            }
            set
            {
                ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Department>("WorkModel.FK_Major_Department", "Department").Value = value;
            }
        }
        /// <summary>
        /// 架构中不存在 Department 的注释。
        /// </summary>
        [global::System.ComponentModel.BrowsableAttribute(false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityReference<Department> DepartmentReference
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedReference<Department>("WorkModel.FK_Major_Department", "Department");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedReference<Department>("WorkModel.FK_Major_Department", "Department", value);
                }
            }
        }
    }
    /// <summary>
    /// 架构中不存在 WorkModel.School 的注释。
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="School")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class School : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 School 对象。
        /// </summary>
        /// <param name="id">ID 的初始值。</param>
        public static School CreateSchool(int id)
        {
            School school = new School();
            school.ID = id;
            return school;
        }
        /// <summary>
        /// 架构中不存在属性 ID 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// 架构中不存在属性 SchoolName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string SchoolName
        {
            get
            {
                return this._SchoolName;
            }
            set
            {
                this.OnSchoolNameChanging(value);
                this.ReportPropertyChanging("SchoolName");
                this._SchoolName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("SchoolName");
                this.OnSchoolNameChanged();
            }
        }
        private string _SchoolName;
        partial void OnSchoolNameChanging(string value);
        partial void OnSchoolNameChanged();
        /// <summary>
        /// 架构中不存在 College 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmRelationshipNavigationPropertyAttribute("WorkModel", "FK_College_School", "College")]
        [global::System.Xml.Serialization.XmlIgnoreAttribute()]
        [global::System.Xml.Serialization.SoapIgnoreAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Data.Objects.DataClasses.EntityCollection<College> College
        {
            get
            {
                return ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.GetRelatedCollection<College>("WorkModel.FK_College_School", "College");
            }
            set
            {
                if ((value != null))
                {
                    ((global::System.Data.Objects.DataClasses.IEntityWithRelationships)(this)).RelationshipManager.InitializeRelatedCollection<College>("WorkModel.FK_College_School", "College", value);
                }
            }
        }
    }
    /// <summary>
    /// 架构中不存在 WorkModel.sysdiagrams 的注释。
    /// </summary>
    /// <KeyProperties>
    /// diagram_id
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="sysdiagrams")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class sysdiagrams : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 sysdiagrams 对象。
        /// </summary>
        /// <param name="name">name 的初始值。</param>
        /// <param name="principal_id">principal_id 的初始值。</param>
        /// <param name="diagram_id">diagram_id 的初始值。</param>
        public static sysdiagrams Createsysdiagrams(string name, int principal_id, int diagram_id)
        {
            sysdiagrams sysdiagrams = new sysdiagrams();
            sysdiagrams.name = name;
            sysdiagrams.principal_id = principal_id;
            sysdiagrams.diagram_id = diagram_id;
            return sysdiagrams;
        }
        /// <summary>
        /// 架构中不存在属性 name 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string name
        {
            get
            {
                return this._name;
            }
            set
            {
                this.OnnameChanging(value);
                this.ReportPropertyChanging("name");
                this._name = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, false);
                this.ReportPropertyChanged("name");
                this.OnnameChanged();
            }
        }
        private string _name;
        partial void OnnameChanging(string value);
        partial void OnnameChanged();
        /// <summary>
        /// 架构中不存在属性 principal_id 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int principal_id
        {
            get
            {
                return this._principal_id;
            }
            set
            {
                this.Onprincipal_idChanging(value);
                this.ReportPropertyChanging("principal_id");
                this._principal_id = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("principal_id");
                this.Onprincipal_idChanged();
            }
        }
        private int _principal_id;
        partial void Onprincipal_idChanging(int value);
        partial void Onprincipal_idChanged();
        /// <summary>
        /// 架构中不存在属性 diagram_id 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int diagram_id
        {
            get
            {
                return this._diagram_id;
            }
            set
            {
                this.Ondiagram_idChanging(value);
                this.ReportPropertyChanging("diagram_id");
                this._diagram_id = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("diagram_id");
                this.Ondiagram_idChanged();
            }
        }
        private int _diagram_id;
        partial void Ondiagram_idChanging(int value);
        partial void Ondiagram_idChanged();
        /// <summary>
        /// 架构中不存在属性 version 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public global::System.Nullable<int> version
        {
            get
            {
                return this._version;
            }
            set
            {
                this.OnversionChanging(value);
                this.ReportPropertyChanging("version");
                this._version = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("version");
                this.OnversionChanged();
            }
        }
        private global::System.Nullable<int> _version;
        partial void OnversionChanging(global::System.Nullable<int> value);
        partial void OnversionChanged();
        /// <summary>
        /// 架构中不存在属性 definition 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public byte[] definition
        {
            get
            {
                return global::System.Data.Objects.DataClasses.StructuralObject.GetValidValue(this._definition);
            }
            set
            {
                this.OndefinitionChanging(value);
                this.ReportPropertyChanging("definition");
                this._definition = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("definition");
                this.OndefinitionChanged();
            }
        }
        private byte[] _definition;
        partial void OndefinitionChanging(byte[] value);
        partial void OndefinitionChanged();
    }
    /// <summary>
    /// 架构中不存在 WorkModel.VCollege 的注释。
    /// </summary>
    /// <KeyProperties>
    /// ID
    /// </KeyProperties>
    [global::System.Data.Objects.DataClasses.EdmEntityTypeAttribute(NamespaceName="WorkModel", Name="VCollege")]
    [global::System.Runtime.Serialization.DataContractAttribute(IsReference=true)]
    [global::System.Serializable()]
    public partial class VCollege : global::System.Data.Objects.DataClasses.EntityObject
    {
        /// <summary>
        /// 创建新的 VCollege 对象。
        /// </summary>
        /// <param name="id">ID 的初始值。</param>
        public static VCollege CreateVCollege(int id)
        {
            VCollege vCollege = new VCollege();
            vCollege.ID = id;
            return vCollege;
        }
        /// <summary>
        /// 架构中不存在属性 ID 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute(EntityKeyProperty=true, IsNullable=false)]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public int ID
        {
            get
            {
                return this._ID;
            }
            set
            {
                this.OnIDChanging(value);
                this.ReportPropertyChanging("ID");
                this._ID = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value);
                this.ReportPropertyChanged("ID");
                this.OnIDChanged();
            }
        }
        private int _ID;
        partial void OnIDChanging(int value);
        partial void OnIDChanged();
        /// <summary>
        /// 架构中不存在属性 CollegeName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string CollegeName
        {
            get
            {
                return this._CollegeName;
            }
            set
            {
                this.OnCollegeNameChanging(value);
                this.ReportPropertyChanging("CollegeName");
                this._CollegeName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("CollegeName");
                this.OnCollegeNameChanged();
            }
        }
        private string _CollegeName;
        partial void OnCollegeNameChanging(string value);
        partial void OnCollegeNameChanged();
        /// <summary>
        /// 架构中不存在属性 SchoolName 的注释。
        /// </summary>
        [global::System.Data.Objects.DataClasses.EdmScalarPropertyAttribute()]
        [global::System.Runtime.Serialization.DataMemberAttribute()]
        public string SchoolName
        {
            get
            {
                return this._SchoolName;
            }
            set
            {
                this.OnSchoolNameChanging(value);
                this.ReportPropertyChanging("SchoolName");
                this._SchoolName = global::System.Data.Objects.DataClasses.StructuralObject.SetValidValue(value, true);
                this.ReportPropertyChanged("SchoolName");
                this.OnSchoolNameChanged();
            }
        }
        private string _SchoolName;
        partial void OnSchoolNameChanging(string value);
        partial void OnSchoolNameChanged();
    }
}
