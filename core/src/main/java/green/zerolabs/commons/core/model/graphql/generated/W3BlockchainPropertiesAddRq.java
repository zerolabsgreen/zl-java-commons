package green.zerolabs.commons.core.model.graphql.generated;

import org.eclipse.microprofile.graphql.NonNull;

// Autogenerated. Do not modify. Will be overridden. Generated by green.zerolabs.gqgen.Generator$TypeGenerator
@io.quarkus.runtime.annotations.RegisterForReflection
@lombok.Data
@lombok.NoArgsConstructor
public class W3BlockchainPropertiesAddRq implements java.io.Serializable  {
    String userId;
    @NonNull Long netId;
    @NonNull Long topic;
    @NonNull String batchFactory;
    @NonNull String registry;
    @NonNull String agreementFactory;
    @NonNull String networkName;
    @NonNull String networkBlockExplorerUrl;
    @NonNull String rpcNode;
    String rpcNodeFallback;
    @NonNull String platformOperatorPrivateKey;
    @NonNull String mnemonicPhrase;
    @NonNull String fileClientApiKey;
    @NonNull String fileClientApiUrl;
    @NonNull String fileClientApiUploadUrl;
    @NonNull String fileClientApiDownloadUrl;
    @NonNull String fileClientCollectionDefault;
}
