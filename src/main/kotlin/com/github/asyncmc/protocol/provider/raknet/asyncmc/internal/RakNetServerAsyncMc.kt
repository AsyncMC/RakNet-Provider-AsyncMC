package com.github.asyncmc.protocol.provider.raknet.asyncmc.internal

import com.github.asyncmc.protocol.raknet.RakNetServer
import java.net.InetSocketAddress
import com.github.asyncmc.protocol.raknet.api.RakNetServer as RakNetServerApi

/**
 * @author joserobjr
 * @since 2021-01-06
 */
internal class RakNetServerAsyncMc(
    socketAddresses: Set<InetSocketAddress>
): RakNetServerApi {
    private val raknet = RakNetServer {
        this.socketAddresses += socketAddresses
    }

    override val guids: LongArray
        get() = longArrayOf(raknet.guid)
    
    override fun close() {
        raknet.close()
    }
}
