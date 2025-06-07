package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class ij0 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f9770a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jj0 f9771b;

    ij0(jj0 jj0Var) {
        this.f9771b = jj0Var;
    }

    private final Socket a(Socket socket) throws SocketException {
        jj0 jj0Var = this.f9771b;
        if (jj0Var.f10537s > 0) {
            socket.setReceiveBufferSize(jj0Var.f10537s);
        }
        this.f9771b.f10538t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws SocketException {
        Socket socketCreateSocket = this.f9770a.createSocket(str, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws SocketException {
        Socket socketCreateSocket = this.f9770a.createSocket(str, i10, inetAddress, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws SocketException {
        Socket socketCreateSocket = this.f9770a.createSocket(inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws SocketException {
        Socket socketCreateSocket = this.f9770a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.f9770a.createSocket(socket, str, i10, z10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f9770a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f9770a.getSupportedCipherSuites();
    }
}
