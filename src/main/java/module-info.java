import com.github.asyncmc.protocol.raknet.api.RakNetAPI;

module com.github.asyncmc.protocol.provider.raknet.asyncmc {
    requires kotlin.stdlib;
    requires kotlin.stdlib.jdk7;
    requires kotlin.stdlib.jdk8;
    
    requires com.github.asyncmc.protocol.raknet;
    requires com.github.asyncmc.protocol.service.raknet;
    provides RakNetAPI with com.github.asyncmc.protocol.provider.raknet.asyncmc.RakNetProviderAsyncMc;
    
    exports com.github.asyncmc.protocol.provider.raknet.asyncmc;
}
