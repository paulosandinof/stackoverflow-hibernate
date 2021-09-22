package com.ufrn.utils;

public class Annotations {
    public static final String HIBERNATE_ANNOTATIONS = "@AccessType" + "|@Any" + "|@AnyMetaDef" + "|@AnyMetaDefs"
            + "|@AttributeAccessor" + "|@BatchSize" + "|@Cache" + "|@Cascade" + "|@Check" + "|@CollectionId"
            + "|@CollectionType" + "|@ColumnDefault" + "|@Columns" + "|@ColumnTransformer" + "|@ColumnTransformers"
            + "|@CreationTimestamp" + "|@DiscriminatorFormula" + "|@DiscriminatorOptions" + "|@DynamicInsert"
            + "|@DynamicUpdate" + "|@Entity" + "|@Fetch" + "|@FetchProfile" + "|@FetchProfile.FetchOverride"
            + "|@FetchProfiles" + "|@Filter" + "|@FilterDef" + "|@FilterDefs" + "|@FilterJoinTable"
            + "|@FilterJoinTables" + "|@Filters" + "|@ForeignKey" + "|@Formula" + "|@Generated" + "|@GeneratorType"
            + "|@GenericGenerator" + "|@GenericGenerators" + "|@Immutable" + "|@Index" + "|@IndexColumn"
            + "|@JoinColumnOrFormula" + "|@JoinColumnsOrFormulas" + "|@JoinFormula" + "|@LazyCollection" + "|@LazyGroup"
            + "|@LazyToOne" + "|@ListIndexBase" + "|@Loader" + "|@ManyToAny" + "|@MapKeyType" + "|@MetaValue"
            + "|@NamedNativeQueries" + "|@NamedNativeQuery" + "|@NamedQueries" + "|@NamedQuery" + "|@Nationalized"
            + "|@NaturalId" + "|@NaturalIdCache" + "|@NotFound" + "|@OnDelete" + "|@OptimisticLock"
            + "|@OptimisticLocking" + "|@OrderBy" + "|@ParamDef" + "|@Parameter" + "|@Parent" + "|@Persister"
            + "|@Polymorphism" + "|@Proxy" + "|@RowId" + "|@SelectBeforeUpdate" + "|@Sort" + "|@SortComparator"
            + "|@SortNatural" + "|@Source" + "|@SQLDelete" + "|@SQLDeleteAll" + "|@SqlFragmentAlias" + "|@SQLInsert"
            + "|@SQLUpdate" + "|@Subselect" + "|@Synchronize" + "|@Table" + "|@Tables" + "|@Target" + "|@Tuplizer"
            + "|@Tuplizers" + "|@Type" + "|@TypeDef" + "|@TypeDefs" + "|@UpdateTimestamp" + "|@ValueGenerationType"
            + "|@Where" + "|@WhereJoinTable";

    public static final String JPA_ANNOTATIONS = "@Access" + "@|AssociationOverride" + "@|AssociationOverrides"
            + "@|AttributeOverride" + "@|AttributeOverrides" + "@|Basic" + "@|Cacheable" + "@|CollectionTable"
            + "@|Column" + "@|ColumnResult" + "@|ConstructorResult" + "@|Convert" + "@|Converter" + "@|Converts"
            + "@|DiscriminatorColumn" + "@|DiscriminatorValue" + "@|ElementCollection" + "@|Embeddable" + "@|Embedded"
            + "@|EmbeddedId" + "@|Entity" + "@|EntityListeners" + "@|EntityResult" + "@|Enumerated"
            + "@|ExcludeDefaultListeners" + "@|ExcludeSuperclassListeners" + "@|FieldResult" + "@|ForeignKey"
            + "@|GeneratedValue" + "@|Id" + "@|IdClass" + "@|Index" + "@|Inheritance" + "@|JoinColumn" + "@|JoinColumns"
            + "@|JoinTable" + "@|Lob" + "@|ManyToMany" + "@|ManyToOne" + "@|MapKey" + "@|MapKeyClass" + "@|MapKeyColumn"
            + "@|MapKeyEnumerated" + "@|MapKeyJoinColumn" + "@|MapKeyJoinColumns" + "@|MapKeyTemporal"
            + "@|MappedSuperclass" + "@|MapsId" + "@|NamedAttributeNode" + "@|NamedEntityGraph" + "@|NamedEntityGraphs"
            + "@|NamedNativeQueries" + "@|NamedNativeQuery" + "@|NamedQueries" + "@|NamedQuery"
            + "@|NamedStoredProcedureQueries" + "@|NamedStoredProcedureQuery" + "@|NamedSubgraph" + "@|OneToMany"
            + "@|OneToOne" + "@|OrderBy" + "@|OrderColumn" + "@|PersistenceContext" + "@|PersistenceContexts"
            + "@|PersistenceProperty" + "@|PersistenceUnit" + "@|PersistenceUnits" + "@|PostLoad" + "@|PostPersist"
            + "@|PostRemove" + "@|PostUpdate" + "@|PrePersist" + "@|PreRemove" + "@|PreUpdate"
            + "@|PrimaryKeyJoinColumn" + "@|PrimaryKeyJoinColumns" + "@|QueryHint" + "@|SecondaryTable"
            + "@|SecondaryTables" + "@|SequenceGenerator" + "@|SequenceGenerators" + "@|SqlResultSetMapping"
            + "@|SqlResultSetMappings" + "@|StoredProcedureParameter" + "@|Table" + "@|TableGenerator"
            + "@|TableGenerators" + "@|Temporal" + "@|Transient" + "@|UniqueConstraint" + "@|Version";

    private Annotations() {
    }
}
