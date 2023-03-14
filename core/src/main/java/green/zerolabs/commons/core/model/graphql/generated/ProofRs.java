package green.zerolabs.commons.core.model.graphql.generated;

import java.util.List;
import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class ProofRs implements java.io.Serializable,IdOnly  {
    @NonNull String id;
    @NonNull ProofStatus proofStatus;
    String w2Url;
    String w2StorageUrl;
    String w2StorageName;
    String w2StoragePath;
    String w3StorageUrl;
    String transactionId;
    String requestDate;
    String generationDate;
    String error;
    ProofDetailsRs details;
    CertificateRs certificate;
    List<IndexedCertificateRs> indexedCertificates;
    List<CertificateRs> rootCertificates;
    BeneficiaryRs beneficiaryData;
    List<SellerRs> sellers;
    List<SupplierRs> suppliers;
    List<GeneratorRs> generators;
    AgreementRs agreement;
    ConsumptionEntityRs consumptionEntity;
}