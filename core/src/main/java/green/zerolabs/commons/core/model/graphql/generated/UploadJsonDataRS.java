package green.zerolabs.commons.core.model.graphql.generated;

import java.util.List;
import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class UploadJsonDataRS implements java.io.Serializable  {
    @NonNull String result;
    Boolean isError;
    List<String> errors;
}