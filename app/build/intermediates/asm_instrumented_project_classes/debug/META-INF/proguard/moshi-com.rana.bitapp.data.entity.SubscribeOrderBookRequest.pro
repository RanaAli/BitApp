-if class com.rana.bitapp.data.entity.SubscribeOrderBookRequest
-keepnames class com.rana.bitapp.data.entity.SubscribeOrderBookRequest
-if class com.rana.bitapp.data.entity.SubscribeOrderBookRequest
-keep class com.rana.bitapp.data.entity.SubscribeOrderBookRequestJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
