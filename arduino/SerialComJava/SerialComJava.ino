String b = "";
void setup() {
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);
  
}

void loop() {
  if(Serial.available() > 0){
    String a = Serial.readString();
    a.trim();
    

    if(a.equals("retorna")){
      Serial.println(b);
    } else { b = a;}
    if(a.equals("liga")){
     
      digitalWrite(LED_BUILTIN, HIGH);
    }

    if(a.equals("desliga")){
     
      digitalWrite(LED_BUILTIN, LOW);
    }
    
  }

}
