<!DOCTYPE html>
<html lang="ca">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.10.2/css/all.css">
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="./javascript/javascript.js"></script>
    <script>
    $(document).ready(function(){
      $("#myInput").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#myList .producte1").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });
    });
    </script>
    <link rel="stylesheet" href="./css/styles.css" />  
    <title>Ski World - Lloguer d'equips d'esquí</title>
  </head>
  <body>
    <header>
      <img src="./media/logo.png" class="logo" />
      <nav>
        <ul>
            <li><a href="index.html">INICI</a></li>
            <li><a href="equips.php">EQUIPS</a></li>
            <li><a href="contact.asp">CONTACTE</a></li>
          </ul>
      </nav>
      <br />
      <a class="menu-mob" href="#" onclick="filtres()"><i class="fas fa-bars">&nbsp;</i>MENÚ</a>
      <ul id="mobil-menu" class="menu-mob">
            <li><a href="index.html">INICI</a></li>
            <li><a href="equips.php">EQUIPS</a></li>
            <li><a href="contact.asp">CONTACTE</a></li>
          </ul>
    </header>
    <div class="carousel">
      <img src="./media/carousel.jpg" />
    </div>
    <div class="content">
      <h1>EQUIPAMENT VARIAT</h1>
      <label>Filtra per material: </label><input id="myInput" type="text" placeholder="Esquis, casc, botes..">
      <section id="myList" class="material">
          <?php
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "skiworld";

            // Create connection
            $conn = new mysqli($servername, $username, $password, $dbname);
            // Check connection
            if ($conn->connect_error) {
                die("Connection failed: " . $conn->connect_error);
            }

            $sql = "SELECT * FROM material";
            $result = $conn->query($sql);

            if ($result->num_rows > 0) {
                // output data of each row
                while($row = $result->fetch_assoc()) {
                    echo "<div class='producte1'><br><img style='width: 72%;' src='".$row['imatge2']."' /> <br>". $row["material"]. " <br> <strong>Ref.:</strong> ". $row["id_material"]. " <br> <strong>". $row["nom"]. " </strong><br> <strong>Talla: </strong>" . $row["talla"] . " <br> <strong>Preu: </strong>" .$row["preu"] ."€ <br><br></div> ";
                }
            } else {
                echo "0 results";
            }

            $conn->close();
            ?>
      </section>
    </div>
    <footer>
      <div class="row">
        <div class="col-sm-12 col-md-6">
          <img class="logo2" src="./media/logo2.png" />
        </div>
        <div class="col-sm-12 col-md-6">
          <ul>
            <li><a href="default.asp">AVÍS LEGAL</a></li>
            <li><a href="news.asp">POLÍTICA DE COOKES</a></li>
            <li><a href="contact.asp">POLÍTICA DE PRIVACITAT</a></li>
          </ul>
        </div>
      </div>
    </footer>
  </body>
</html>