package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0999Vo implements InterfaceC0624Gu {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final HG<? super C0999Vo> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, 24, 20, 26, 23, 8, 10, -59, 14, 9, 10, 19, 25, 14, 11, 14, 10, 23, -59, 18, 26, 24, 25, -59, 7, 10, -59, 6, 19, -59, 14, 19, 25, 10, 12, 10, 23, -45, 5, 2, -7, -48, 29, 37, 35, 36, -48, 37, 35, 21, -48, 35, 19, 24, 21, 29, 21, -48, 34, 17, 39, 34, 21, 35, 31, 37, 34, 19, 21, 36, 19, 41, 36, 23, 37, 33, 39, 36, 21, 23};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException {
        try {
            Uri uri = c0628Gy.A04;
            this.A02 = uri;
            if (!TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                throw new HF(A00(39, 31, 105));
            }
            try {
                this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                this.A03 = fileInputStream;
                fileInputStream.skip(this.A01.getStartOffset());
                if (this.A03.skip(c0628Gy.A03) < c0628Gy.A03) {
                    throw new EOFException();
                }
                if (c0628Gy.A02 != -1) {
                    this.A00 = c0628Gy.A02;
                } else {
                    long length = this.A01.getLength();
                    this.A00 = length != -1 ? length - c0628Gy.A03 : -1L;
                }
                this.A04 = true;
                HG<? super C0999Vo> hg = this.A06;
                if (hg != null) {
                    hg.ADP(this, c0628Gy);
                }
                return this.A00;
            } catch (NumberFormatException unused) {
                throw new HF(A00(0, 39, 94));
            }
        } catch (IOException e5) {
            throw new HF(e5);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C0999Vo(Context context, HG<? super C0999Vo> hg) {
        this.A05 = context.getResources();
        this.A06 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws HF {
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e5) {
                        throw new HF(e5);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super C0999Vo> hg = this.A06;
                        if (hg != null) {
                            hg.ADO(this);
                        }
                    }
                }
            } catch (IOException e10) {
                throw new HF(e10);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A01;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super C0999Vo> hg2 = this.A06;
                        if (hg2 != null) {
                            hg2.ADO(this);
                        }
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new HF(e11);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    HG<? super C0999Vo> hg3 = this.A06;
                    if (hg3 != null) {
                        hg3.ADO(this);
                    }
                }
            }
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e5) {
                throw new HF(e5);
            }
        }
        int i12 = this.A03.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HF(new EOFException());
        }
        long j11 = this.A00;
        if (j11 != -1) {
            this.A00 = j11 - i12;
        }
        HG<? super C0999Vo> hg = this.A06;
        if (hg != null) {
            hg.AB1(this, i12);
        }
        return i12;
    }
}
