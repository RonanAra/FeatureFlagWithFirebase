package br.com.featureflagwithfirebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.featureflagwithfirebase.ui.theme.FeatureFlagWithFirebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatureFlagWithFirebaseTheme {

            }
        }
    }
}