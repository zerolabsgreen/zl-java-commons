package green.zerolabs.commons.core.model.graphql.generated;

import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class UserDetailsRs implements java.io.Serializable,IdOnly  {
    @NonNull String id;
    String name;
    String email;
    String companyName;
    String vat;
    String address;
    String state;
    String zip;
    String city;
    String country;
    String blockchainAddress;
    String logo;
    String metadataId;
    String metadataType;
}