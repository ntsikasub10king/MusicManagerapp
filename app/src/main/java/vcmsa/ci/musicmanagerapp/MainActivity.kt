package vcmsa.ci.musicmanagerapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vcmsa.ci.musicmanagerapp.ui.theme.MusicManagerAppTheme

class MainActivity : ComponentActivity() {
    private val details = arrayOf("Song title","Artist name","rating","comments")


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val nextButton = findViewById<Button>(R.id.nextButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        exitButton.setOnClickListener{
            finish()
        }

        nextButton.setOnClickListener{
            setContentView(R.layout.song_details)

            val returnButton = findViewById<Button>(R.id.returnButton)
            val calculateButton = findViewById<Button>(R.id.calculateButton)
            val listButton = findViewById<Button>(R.id.ListButton)

            returnButton.setOnClickListener{
                recreate() // go back to main layout

                exitButton.setOnClickListener{
                    recreate()
                }

                }
            }
        }

    }



