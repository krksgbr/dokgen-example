const configs = {
    repoLink: 'https://github.com/openrndr/openrndr-guide',
};


window.$docsify = {
    name: 'DokGen example',
    auto2top: true,
    loadSidebar: true,
    maxLevel: 2,
    subMaxLevel: 2,
    coverpage: false,
    executeScript: true,
    autoHeader: true,
    formatUpdated: '{DD}-{MM}-{YYYY}',
    search: {
        noData: {
            '/': 'No results'
        },
        paths: 'auto',
        placeholder: {
            '/': 'Search'
        }
    },
    plugins: [
        plugins.linkify,
        plugins.editLink,
    ],
    homepage: '01_Chapter1/C00IntroToDokGen.md',
    themeColor: '#fdd0dd',
};

window.onload = () => {
     document.body.classList.add("loaded");
 };