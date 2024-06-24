document.addEventListener('DOMContentLoaded', function() {
    const introText = document.querySelector('.intro-text');
    const introImage = document.querySelector('.intro-image');

    introText.style.opacity = 0;
    introImage.style.transform = 'translateX(100px)';
    introImage.style.opacity = 0;

    setTimeout(() => {
        introText.style.transition = 'opacity 1s';
        introText.style.opacity = 1;
        introImage.style.transition = 'transform 1s, opacity 1s';
        introImage.style.transform = 'translateX(0)';
        introImage.style.opacity = 1;
    }, 100);
});



document.addEventListener('DOMContentLoaded', function() {
    const navLinks = document.querySelectorAll('nav ul li a');
    
    navLinks.forEach(link => {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            const targetId = this.getAttribute('href').substring(1);
            const targetElement = document.getElementById(targetId);
            
            window.scrollTo({
                top: targetElement.offsetTop,
                behavior: 'smooth'
            });
        });
    });
});
