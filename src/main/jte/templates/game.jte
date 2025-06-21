@param String message
<!DOCTYPE html>
<html>
<head>
    <title>Devinez le nombre</title>
</head>
<body>
    <h1>Jeu : Devinez le nombre</h1>
    <p>Choisissez un nombre entre 1 et 100.</p>
    <form method="post" action="/guess">
        <input type="number" name="guess" min="1" max="100" required>
        <button type="submit">Deviner</button>
    </form>
    <p>${message}</p>
</body>
</html>
