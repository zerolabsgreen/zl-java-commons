package green.zerolabs.commons.core.model.graphql.generated;

import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class BuyerRq implements java.io.Serializable  {
    @NonNull String name;
    String logoUrl;
    String address;
    @NonNull String email;
    @NonNull String cryptoAddress;
}
