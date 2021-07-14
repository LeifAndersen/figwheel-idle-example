const config = {
    target: 'web',
    resolve: {
        fallback: {
            buffer: false,
            url: false,
            path: require.resolve("path-browserify"),
            http: require.resolve("stream-http")
        },
    },
    optimization: {
        minimize: false
    }
};

module.exports = config;
