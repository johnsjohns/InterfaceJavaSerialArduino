String b = "";
void setup() {
  Serial.begin(9600);
  for(int i = 0; i <= 13; i++){
  pinMode(i, OUTPUT);
  }
  Serial.println("Conectado");
  
}

void loop() {
  if(Serial.available() > 0){
    String recebido = Serial.readString();
    recebido.trim();
    
    if(recebido.substring(0,4).equals("TRUE")){
      digitalWrite(recebido.substring(5).toInt(), HIGH);
      Serial.println(recebido.substring(5));
    }

    if(recebido.substring(0,5).equals("FALSE")){
     
      digitalWrite(recebido.substring(6).toInt(), LOW);
    }
    
  }

}
