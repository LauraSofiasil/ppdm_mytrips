package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.versionedparcelable.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Card(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .height(70.dp)
                .width(180.dp),
            shape = RoundedCornerShape(
                bottomStart = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF860A2E)
            )
        ) {}
        Card(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .height(70.dp)
                .width(180.dp),
            shape = RoundedCornerShape(
                topEnd = 30.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF860A2E)
            )
        ) {}
        Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent),
                verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp)
                    .padding(end = 20.dp)
            ) {
                Text(
                    text = stringResource(
                        br.senai.sp.jandira.mytrips.R.string.login
                    ),
                    fontSize = 60.sp,
                    color = Color(0xFF860A2E)
                )
                Text(
                    text = stringResource(
                        br.senai.sp.jandira.mytrips.R.string.please
                    ),
                    fontSize = 10.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(bottom = 64.dp)
                )
                OutlinedTextField(
                    value = "xxxxxxx@gmail.com",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFF860A2E)
                        )
                    },
                    modifier = Modifier
                        .padding(bottom = 20.dp),
                    shape = RoundedCornerShape(
                        13.dp
                    ),
                    label = {
                        Text(
                            text = stringResource(
                                br.senai.sp.jandira.mytrips.R.string.email
                            )
                        )
                    }
                )
                OutlinedTextField(
                    value = "xxxxxxxxx",
                    onValueChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFF860A2E)
                        )
                    },
                    modifier = Modifier
                        .padding(bottom = 64.dp),
                    shape = RoundedCornerShape(
                        13.dp
                    ),
                    label = {
                        Text(
                            text = stringResource(
                                br.senai.sp.jandira.mytrips.R.string.password
                            )
                        )
                    }
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF860A2E)
                    ),
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(bottom = 20.dp),
                    shape = RoundedCornerShape(
                        10.dp
                    )
                ) {
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.sign
                        ),
                        fontSize = 15.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(end = 2.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "",
                        tint = Color.White
                    )
                }
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                ) {
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.account
                        ),
                        fontSize = 10.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(end = 3.dp)
                    )
                    Text(
                        text = stringResource(
                            br.senai.sp.jandira.mytrips.R.string.signup
                        ),
                        fontSize = 10.sp,
                        color = Color(0xFF860A2E)
                    )
                }

            }
        }

    }
}





@Preview
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}