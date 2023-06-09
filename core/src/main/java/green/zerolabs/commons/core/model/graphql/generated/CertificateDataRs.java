package green.zerolabs.commons.core.model.graphql.generated;

import java.util.List;
import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class CertificateDataRs implements java.io.Serializable,IdOnly  {
    @NonNull String id;
    String energyAmount;
    ConsumptionUnit energyUnit;
    String generatorId;
    String sellerId;
    String supplierId;
    String certificateRegistry;
    W3ProductType productType;
    String generationStart;
    String generationEnd;
    String redemptionDate;
    String label;
    String orderId;
    List<String> agreementIdList;
    String redemptionStatementId;
}
