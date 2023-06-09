package green.zerolabs.commons.core.model.graphql.generated;

import java.util.List;
import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class SaveGeneratorRq implements java.io.Serializable  {
    String id;
    @NonNull String generatorName;
    @NonNull EnergyType energySource;
    @NonNull String country;
    String region;
    java.math.BigDecimal latitude;
    java.math.BigDecimal longitude;
    Long nameplateCapacity;
    String capacityUnit;
    String commissioningDate;
    String impactStory;
    List<String> images;
    List<String> links;
    String inventoryId;
}
