package green.zerolabs.commons.core.model.graphql.generated;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class ProofTransactionsRq implements java.io.Serializable  {
    String userId;
    ProofStatus status;
    String startDate;
    String endDate;
    Long numResults;
}