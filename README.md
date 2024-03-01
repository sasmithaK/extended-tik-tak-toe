# extended-tik-tak-toe
My final goal is to create a Super Tik Tac Toe game, an extended version of Tik Tak Toe which I came across in a Michael Stevens(from Vsauce) video.
https://youtube.com/shorts/_Na3a1ZrX7c?feature=shared


I'm currently trying to make the traditional Tik Tak Toe.
<pre> 
  // this is how cells are arranged
  +-----+-----+-----+ 
  |  1  |  2  |  3  | 
  +-----+-----+-----+ 
  |  4  |  5  |  6  |  
  +-----+-----+-----+ 
  |  7  |  8  |  9  | 
  +-----+-----+-----+ 
  

  // example scenario :
  
X input : 1
  +-----+-----+-----+ 
  |  X  |  .  |  .  | 
  +-----+-----+-----+ 
  |  .  |  .  |  .  | 
  +-----+-----+-----+ 
  |  .  |  .  |  .  | 
  +-----+-----+-----+ 

0 input : 6 
  +-----+-----+-----+ 
  |  X  |  .  |  .  | 
  +-----+-----+-----+ 
  |  .  |  .  |  .  | 
  +-----+-----+-----+ 
  |  .  |  0  |  .  | 
  +-----+-----+-----+ 

  arr[3][3] = {{"X", ".", "."}
               {".", ".", "."}
               {".", "0", "."}}
</pre>
