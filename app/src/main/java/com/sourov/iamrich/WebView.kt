package com.sourov.iamrich

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import com.sourov.iamrich.databinding.ActivityWebViewBinding

class WebView : AppCompatActivity() {
    lateinit var binding : ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webview.apply {
            webViewClient = WebViewClient()
            loadUrl("https://epikason.weebly.com/")
            settings.javaScriptEnabled = true
            settings.domStorageEnabled = true
            settings.useWideViewPort = true
            settings.loadWithOverviewMode = true
            settings.builtInZoomControls = true
            settings.displayZoomControls = false
        }
        onBackPressedDispatcher.addCallback(this) {
            if (binding.webview.canGoBack()) {
                binding.webview.goBack()
            } else {
                finish()
            }
        }
    }
}