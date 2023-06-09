package green.zerolabs.commons.core.model.graphql.generated;

import java.util.List;
import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class OfferRs implements java.io.Serializable,IdOnly  {
    @NonNull String id;
    String inventoryId;
    W3ProductType productType;
    List<EnergyType> energyTypes;
    List<ConsumptionLocationRs> countryRegions;
    String reportingStart;
    String reportingEnd;
    java.math.BigDecimal unitPrice;
    ConsumptionUnit energyUnit;
    String description;
    String image;
    Boolean disabled;
}
